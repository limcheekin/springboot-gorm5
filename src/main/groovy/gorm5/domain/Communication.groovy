package gorm5.domain

import grails.persistence.Entity

@Entity
class Communication {

	CommunicationType type
	String value
	
	static belongsTo = [person:Person]
	
	static constraints = {
		type nullable:false
		value blank:false
	}
}

enum CommunicationType {
	WORK_NUMBER {

		public String toString() {
			return "Work Number"
		}
	},

	HOME_NUMBER {

		public String toString() {
			return "Home Number"
		}
	},
	MOBILE_NUMBER {

		public String toString() {
			return "Mobile Number"
		}
	},
	EMAIL_ADDRESS {

		public String toString() {
			return "Email Address"
		}
	}
}

