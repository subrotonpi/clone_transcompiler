def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        sc = __main__
        day = sc.get ( 'day' )
        ans = 0
        if day == 'Monday' :
            ans = 5
        if day == 'Tuesday' :
            ans = 4
        if day == 'Wednesday' :
            ans = 3
        if day == 'Thursday' :
            ans = 2
        if day == 'Friday' :
            ans = 1
        print ( ans )
