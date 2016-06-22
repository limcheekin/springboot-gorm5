package gorm5.service

import javax.inject.Named
import javax.transaction.Transactional
import gorm5.domain.Person

@Transactional
@Named
class PersonService {
	def count() {
		Person.count()
	}
}