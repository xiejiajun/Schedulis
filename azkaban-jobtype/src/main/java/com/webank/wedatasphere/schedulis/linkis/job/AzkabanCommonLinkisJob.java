/*
 * Copyright 2020 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.schedulis.linkis.job;

import com.webank.wedatasphere.schedulis.linkis.conf.LinkisJobTypeConf;
import com.webank.wedatasphere.dss.linkis.node.execution.job.AbstractCommonLinkisJob;
import org.apache.commons.lang.StringUtils;


/**
 * Created by peacewong on 2019/11/3.
 */
public class AzkabanCommonLinkisJob extends AbstractCommonLinkisJob {


    @Override
    public String getSubmitUser() {
        if (StringUtils.isEmpty(getJobProps().get(LinkisJobTypeConf.FLOW_SUBMIT_USER))){
            return getJobProps().get(LinkisJobTypeConf.PROXY_USER);
        }
        return getJobProps().get(LinkisJobTypeConf.FLOW_SUBMIT_USER);
    }


    @Override
    public String getUser() {
        return getJobProps().get(LinkisJobTypeConf.PROXY_USER);
    }

    @Override
    public String getJobName() {
        return getJobProps().get(LinkisJobTypeConf.JOB_ID);
    }


}
