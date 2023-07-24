<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/views/includes/header.jsp"%>
<div class="row">
	<div class="col-md-6">
		<div class="card">
			<form class="form-horizontal" id="actionForm">
				<div class="card-body">
					<h4 class="card-title">ManageUserformPage</h4>
					<div class="form-group row">
						<label for="phonNumber"
							class="col-sm-3 text-end control-label col-form-label">전화번호</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="phonNumber"
								name="phonNumber"
								value="<c:out value='${manageUserVO.phonNumber }'></c:out>">
							<input type="submit" value="인증요청">
						</div>
					</div>
					<div class="form-group row">
						<label for="name"
							class="col-sm-3 text-end control-label col-form-label">이름</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" name="name" id="name"
								value="<c:out value='${manageUserVO.name }'></c:out>">
						</div>
					</div>
					<div class="form-group row">
						<label for="password"
							class="col-sm-3 text-end control-label col-form-label">비밀번호</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="password"
								name="password"
								value="<c:out value='${manageUserVO.password }'></c:out>">
						</div>

						<!-- birth -->
						<div>
							<h3>
								<label for="yy">생년월일</label>
							</h3>
							<div id="birth">
								<!-- birth_YY -->
								<div id="birth_YY">
									<span class="box"> <input type="text" id="birth_YY"
										class="int" maxlength="4" placeholder="년(4)">
									</span>
								</div>
								<!-- birth_MM -->
								<div id="birth_MM">
									<span class="box"> <select id="birth_MM">
											<option>월</option>
											<option value="01">1</option>
											<option value="02">2</option>
											<option value="03">3</option>
											<option value="04">4</option>
											<option value="05">5</option>
											<option value="06">6</option>
											<option value="07">7</option>
											<option value="08">8</option>
											<option value="09">9</option>
											<option value="10">10</option>
											<option value="11">11</option>
											<option value="12">12</option>
									</select>
									</span>
								</div>
								<!-- birth_DD -->
								<div id="birth_DD">
									<span class="box"> <input type="text" id="birth_DD"
										class="int" maxlength="2" placeholder="일">
									</span>
								</div>
							</div>
							<span class="error_next_box"></span>
						</div>



						<div class="form-group row">
							<label for="password"
								class="col-sm-3 text-end control-label col-form-label">비밀번호</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="password"
									name="password"
									value="<c:out value='${manageUserVO.password }'></c:out>">
							</div>
						</div>
						<div class="form-group row">
							<label for="joinDate"
								class="col-sm-3 text-end control-label col-form-label">가입일자</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="joinDate"
									name="joinDate"
									value="<c:out value='${manageUserVO.joinDate }'></c:out>">
							</div>
						</div>
						<div class="form-group row">
							<label for="amountCharge"
								class="col-sm-3 text-end control-label col-form-label">충전금액</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="amountCharge"
									name="amountCharge"
									value="<c:out value='${manageUserVO.amountCharge }'></c:out>">
							</div>
						</div>
						<div class="form-group row">
							<label for="point"
								class="col-sm-3 text-end control-label col-form-label">회원포인트</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="point" name="point"
									value="<c:out value='${manageUserVO.point }'></c:out>">
							</div>
						</div>
						<div class="form-group row">
							<label for="dateOfUse"
								class="col-sm-3 text-end control-label col-form-label">이용일자</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="dateOfUse"
									name="dateOfUse"
									value="<c:out value='${manageUserVO.dateOfUse }'></c:out>">
							</div>
						</div>
						<div class="form-group row">
							<label for="memStatus"
								class="col-sm-3 text-end control-label col-form-label">회원상태</label>
							<div class="col-sm-9">
								<select name="memStatus" id="memStatus">
									<option value="HUMEN" selected="selected">휴먼회원</option>
									<option value="DROPOUT" selected="selected">탈퇴회원</option>
								</select>
							</div>
						</div>
						<div class="border-top">
							<div class="card-body">
								<button type="button" id="modifyBtn" class="btn btn-primary"
									onclick="save()">저장</button>
								<button type="button" id="cancelBtn" class="btn btn-primary"
									onclick="goList()">취소</button>
							</div>
						</div>
					</div>
			</form>
		</div>
	</div>
</div>
<%@include file="/WEB-INF/views/includes/modal.jsp"%>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>
<script>
	function save() {
		const data = $('#actionForm').serializeObject();
		$.ajax({
			url : '/user/user/form',
			type : 'PUT',
			//응답 받고 
			headers : { // Http header
				// 요청 보낼때 내가 보낼 data의 타입
				"Content-Type" : "application/json",
			},
			//
			dataType : 'JSON', // 데이터 타입 (html, xml, json, text 등등)
			data : JSON.stringify({
				manageUserVO : data
			}),
			success : function onData(data) {
				alert(data.message);
				if (data.success) {
					location.href = '/user/user/list';
				}
			},
			error : function onError(error) {
				console.log("AA");
				console.error(error);
			}
		});
	}
	
	function goList() {
		const form = document.querySelector("#actionForm");
		form.action = "/user/user/list";
		form.method = "get";
		form.innerHTML = "";
		form.submit();
	}

	document
			.querySelector("#modifyBtn")
			.addEventListener(
					"click",
					function(e) {
						const form = document.querySelector("#actionForm");
						form.action = "/user/user/form";
						document.querySelector("#actionForm").submit();
					});

	/* SECTION - BIRTH */
	.info#info__birth {
	  display: flex;
	}

	.info#info__birth select {
	  margin-left : 7px;
	}

	.info#info__birth select:first-child {
	  margin-left : 0px;
	}
</script>