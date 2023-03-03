def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.split ( '' , 1 )
        po = a [ 0 ]
        count = 1
        ans = ""
        for i in a [ 1 : ] :
            if po == i :
                count += 1
            else :
                ans += po + str ( count )
                po = i
                count = 1
        ans += po + str ( count )
        print ( ans )
