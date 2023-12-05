def import import sys
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.nextInt ( )
        self.list = list ( sc.nextInt ( ) )
        max = self.list.max ( lambda x , y : x - y ) [ 0 ]
        min = self.list.min ( lambda x , y : x - y ) [ 0 ]
        if max == min :
            print ( 0 )
        else :
            if min >= 0 :
                print ( n - 1 )
                for i in range ( 1 , n ) :
                    print ( i , i + 1 )
            elif max <= 0 :
                print ( n - 1 )
                for i in range ( n , 1 , - 1 ) :
                    print ( i , i - 1 )
            else :
                if abs ( min ) <= abs ( max ) :
                    p = self.list.index ( max ) + 1
                    print ( 2 * ( n - 1 ) )
                    for i in range ( 1 , n ) :
                        if p == i :
                            continue
                        print ( p , i )
                    for i in range ( 1 , n ) :
                        print ( i , i + 1 )
                else :
                    p = self.list.index ( min ) + 1
                    print ( 2 * ( n - 1 ) )
                    for i in range ( 1 , n ) :
                        if p == i :
                            continue
                        print ( p , i )
                    for i in range ( n , 1 , - 1 ) :
                        print ( i , i + 1 )
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.list = list ( sc.nextInt ( ) )
