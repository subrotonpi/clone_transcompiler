def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys.stdin
        self.N = self.sys.maxsize
        self.line = self.sys.stdin.readline ( )
        commands = [ c for c in line.split ( ) ]
        resources = [ 'A' , 'B' , 'X' , 'Y' ]
        ret = sys.maxsize
        for c1 in resources :
            for c2 in resources :
                for c3 in resources :
                    for c4 in resources :
                        num = 0
                        for i in range ( self.N ) :
                            if i == self.N - 1 :
                                num += 1
                                break
                            if ( commands [ i ] == c1 and commands [ i + 1 ] == c2 ) or ( commands [ i ] == c3 and commands [ i + 1 ] == c4 ) :
                                i += 1
                            num += 1
                        ret = min ( ret , num )
    print ( ret )
