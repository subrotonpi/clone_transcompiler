def import _FreeCell
class FreeCell ( object ) :
    def __init__ ( self , arg ) :
        sc = _FreeCell ( arg )
        tc = sc.count ( )
        for ctc in range ( 1 , tc + 1 ) :
            print ( "Case #%d: " % ctc , end = '' )
            good = True
            n , pd , pg = _FreeCell ( sc , arg )
            if 100 / gcd ( 100 , pd ) > n :
                good = False
            else :
                if pg == 100 and pd != 100 :
                    good = False
                if pg == 0 and pd != 0 :
                    good = False
            print ( "Possible" if good else "Broken" )
    def gcd ( a , b ) :
        while b != 0 :
            t , b , a = b , a % b , t
        return a
