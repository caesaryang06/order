package com.yxm.order.utils;

import com.yxm.order.vo.ResultVO;

public class ResultVOUtils {

    private ResultVOUtils() {
    }

    public static ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(data);
        return resultVO;
    }

}
