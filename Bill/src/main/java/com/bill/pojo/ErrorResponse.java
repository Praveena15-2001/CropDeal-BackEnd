package com.bill.pojo;


	import java.time.LocalDateTime;

	import org.springframework.http.HttpStatus;



	public class ErrorResponse 
	{
		private HttpStatus statusmsg;
		private String msg;
		private LocalDateTime datetime;
		
		public ErrorResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ErrorResponse(HttpStatus statusmsg, String msg, LocalDateTime datetime) {
			super();
			this.statusmsg = statusmsg;
			this.msg = msg;
			this.datetime = datetime;
		}
		public HttpStatus getStatusmsg() {
			return statusmsg;
		}
		public void setStatusmsg(HttpStatus notFound) {
			this.statusmsg = notFound;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public LocalDateTime getDatetime() {
			return datetime;
		}
		public void setDatetime(LocalDateTime datetime) {
			this.datetime = datetime;
		}
		
		@Override
		public String toString() {
			return "ErrorResponse [statusmsg=" + statusmsg + ", msg=" + msg + ", datetime=" + datetime + "]";
		}
		}

	
	
	
	


