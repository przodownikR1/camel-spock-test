package com.twospoons.camel.spock.service

import groovy.util.logging.Slf4j
import org.apache.camel.Body
import org.springframework.stereotype.Service

@Slf4j
@Service
class SimpleInputService {

    def performSimpleStringTask(@Body String input){
        log.info 'This input is the convered message body from the camel route: {}', input

        def newBody = 'Something the input service created.'

        log.info 'The message body will now be: {}', newBody

        newBody
    }
}
