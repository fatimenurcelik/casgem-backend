package com.kodlamaio.bootcampProject.business.abstracts;

import java.util.List;

import com.kodlamaio.bootcampProject.business.requests.blackList.AddBlackListRequest;
import com.kodlamaio.bootcampProject.business.requests.blackList.UpdateBlackListRequest;
import com.kodlamaio.bootcampProject.business.responses.blackList.AddBlackListResponse;
import com.kodlamaio.bootcampProject.business.responses.blackList.GetAllBlackListResponse;
import com.kodlamaio.bootcampProject.business.responses.blackList.GetBlackListResponse;
import com.kodlamaio.bootcampProject.business.responses.blackList.UpdateBlackListResponse;
import com.kodlamaio.bootcampProject.core.utilities.results.DataResult;
import com.kodlamaio.bootcampProject.core.utilities.results.Result;

public interface BlackListService {
	DataResult<AddBlackListResponse> add(AddBlackListRequest addBlackListRequest);
	DataResult<UpdateBlackListResponse> update (UpdateBlackListRequest updateBlackListRequest);
	Result delete (int id);
	DataResult<List<GetAllBlackListResponse>> getAll();
	DataResult<GetBlackListResponse> getById(int id);
	DataResult<GetBlackListResponse> findByApplicantId(int id);
	void checkApplicantAlreadyExistInBlackList(int id);
}
