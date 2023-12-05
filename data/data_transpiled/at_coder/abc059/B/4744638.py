def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ans = ''
    def __call__ ( self , * args ) :
        sc = _main ( args )
        a = sc.split ( )
        b = sc.split ( )
        if len ( a ) > len ( b ) :
            ans = 'GREATER'
        if len ( a ) < len ( b ) :
            ans = 'LESS'
        if len ( a ) == len ( b ) :
            ans = 'EQUAL'
            for i in range ( len ( a ) ) :
                if int ( a [ i ] ) > int ( b [ i ] ) :
                    ans = 'GREATER'
                    break
                elif int ( a [ i ] ) < int ( b [ i ] ) :
                    ans = 'LESS'
                    break
    print ( ans )
