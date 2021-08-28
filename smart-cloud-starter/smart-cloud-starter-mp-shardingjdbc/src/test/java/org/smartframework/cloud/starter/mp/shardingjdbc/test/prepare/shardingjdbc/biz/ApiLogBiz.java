package org.smartframework.cloud.starter.mp.shardingjdbc.test.prepare.shardingjdbc.biz;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.smartframework.cloud.starter.mp.shardingjdbc.test.prepare.shardingjdbc.constants.DatasourceName;
import org.smartframework.cloud.starter.mp.shardingjdbc.test.prepare.shardingjdbc.entity.ApiLogEntity;
import org.smartframework.cloud.starter.mp.shardingjdbc.test.prepare.shardingjdbc.mapper.ApiLogBaseMapper;
import org.smartframework.cloud.starter.mybatis.plus.common.biz.BaseBiz;
import org.springframework.stereotype.Repository;

/**
 * 日志api biz
 *
 * @author liyulin
 * @date 2019-04-08
 */
@Repository
@DS(DatasourceName.LOG)
public class ApiLogBiz extends BaseBiz<ApiLogBaseMapper, ApiLogEntity> {

}