def import _main
class Main ( object ) :
    def __init__ ( self , a ) :
        self.d = [ ]
        b = a
        for i in range ( 19 ) :
            self.d [ 18 - i ] = int ( a % 10 )
            a //= 10
    dp = [ 0 ] * 20
    f = False
    for i in range ( 19 ) :
        dp [ i + 1 ] = 8 * dp [ i ]
        for k in range ( d [ i ] + 1 , 10 ) :
            if k != 4 and k != 9 and not f :
                dp [ i + 1 ] -= 1
        if d [ i ] == 4 or d [ i ] == 9 :
            f = True
    return b + 1 - dp [ 19 ]
