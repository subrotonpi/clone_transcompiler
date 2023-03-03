def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = 'abcdefghijklmnopqrstuvwxyz'.split ( '' , 0 )
        po = self.s [ 0 ]
        a = po.split ( '' , 0 )
        d = { }
        for i in a :
            d [ i ] = 0
        if len ( d ) == 26 :
            print ( 'None' )
        else :
            for i in s :
                if i not in d :
                    print ( i )
                    break
