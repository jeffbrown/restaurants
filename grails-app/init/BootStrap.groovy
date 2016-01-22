class BootStrap {

    def init = { servletContext ->
        new demo.Restaurant(name: "Ruth's Chris").save()
        new demo.Restaurant(name: 'SugarFire').save()
    }
    def destroy = {
    }
}
