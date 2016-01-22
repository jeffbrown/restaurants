package demo

import grails.rest.RestfulController
import grails.transaction.*

@Transactional(readOnly = false)
class RestaurantController extends RestfulController  {

  static responseFormats = ['xml', 'json']

  RestaurantController() {
    super(Restaurant)
  }

}
