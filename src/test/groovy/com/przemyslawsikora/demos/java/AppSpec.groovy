/*
 * Copyright (C) 2018 Przemyslaw Sikora
 */

package com.przemyslawsikora.demos.java

import spock.lang.Specification

class AppSpec extends Specification {
    def "Application shall be able to make a greeting"() {
        setup: "an App instance"
        def app = new App()

        when: "greeting is obtained"
        def result = app.greeting

        then: "it shall not be null"
        result != null
    }
}
