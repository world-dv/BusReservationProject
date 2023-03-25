package bus.busReservation.service;

import bus.busReservation.domain.Bus;
import bus.busReservation.repository.BusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BusService {
    private final BusRepository busRepository;


    //모든 버스의 이름
    // 중복 제거 해야함 !!!!!!!!!!
    public List<Bus> findAllName() {
        List<Bus> list = busRepository.findAll();
        list.remove(1);
        return list;
    }

    public Long findStartBusId(String name){//버스 이름으로 해당 버스의 출발지 찾기

        List<Bus> busList = busRepository.findByName(name);

        if(busList.size() !=0)//이거 안하면 오류남
        {
            Bus bus = busList.get(0);
            return bus.getStart();//버스 정류장의 출발지 반환
        }

        return null;
    }

    //버스 이름으로 해당 버스의 종점 찾기
    public Long findEndBusStopId(String busName){
        List<Bus> busList = busRepository.findByName(busName);

        if(busList.size() !=0)
        {
            Bus bus = busList.get(0);
            return bus.getEnd();//버스 정류장의 도착지 id 반환
        }

        return null;
    }
}
