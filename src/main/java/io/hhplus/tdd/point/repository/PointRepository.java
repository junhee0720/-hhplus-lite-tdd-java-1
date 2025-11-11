package io.hhplus.tdd.point.repository;

import io.hhplus.tdd.database.PointHistoryTable;
import io.hhplus.tdd.database.UserPointTable;
import io.hhplus.tdd.point.PointHistory;
import io.hhplus.tdd.point.TransactionType;
import io.hhplus.tdd.point.UserPoint;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PointRepository {

    private final UserPointTable userPointTable;
    private final PointHistoryTable pointHistoryTable;


    public PointRepository(UserPointTable userPointTable
            , PointHistoryTable pointHistoryTable) {
        this.userPointTable = userPointTable;
        this.pointHistoryTable = pointHistoryTable;
    }

    /**
     * TODO - 특정 유저의 포인트를 조회하는 기능을 작성해주세요.
     */
    UserPoint getUserPoint(Long id) {
        return userPointTable.selectById(id);
    }

    /**
     * TODO - 특정 유저의 포인트를 충전하는 기능을 작성해주세요.
     */
    UserPoint updateUserPoint(long id, long amount){
        return null;
    }

    /**
     * TODO - 특정 유저의 포인트 충전/이용 내역을 조회하는 기능을 작성해주세요.
     */
    PointHistory insertHistory(long id, long amount,
                               TransactionType type){
        return null;
    }

    /**
     * TODO - 특정 유저의 포인트 충전/이용 내역을 조회하는 기능을 작성해주세요.
     */
    List<PointHistory> getHistoryList(long id){
        return null;
    }


}
