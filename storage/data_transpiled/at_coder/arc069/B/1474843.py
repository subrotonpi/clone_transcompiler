def import _cal
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.S = ''
        self.cs = S
        for i in range ( 2 ) :
            for j in range ( 2 ) :
                a = [ i , j ]
                if self.cal ( a ) :
                    for k in range ( N ) :
                        if a [ k ] == 1 :
                            print ( 'S' , end = '' )
                        else :
                            print ( 'W' , end = '' )
                    print ( )
                    return
        print ( - 1 )
    def cal ( a ) :
        for i in range ( 2 , N ) :
            if cs [ i - 1 ] == 'o' :
                if a [ i - 1 ] == 1 :
                    a [ i ] = a [ i - 2 ]
                else :
                    a [ i ] = a [ i - 2 ] ^ 1
            else :
                if a [ i - 1 ] == 1 :
                    a [ i ] = a [ i - 2 ] ^ 1
                else :
                    a [ i ] = a [ i - 2 ]
        if a [ 0 ] == 1 :
            if cs [ 0 ] == 'o' :
                if a [ 1 ] != a [ N - 1 ] :
                    return False
            if cs [ 0 ] == 'x' :
                if a [ 1 ] == a [ N - 1 ] :
                    return False
            else :
                return a [ N - 2 ] == a [ 0 ]
        else :
            if cs [ 0 ] == 'o' :
                if a [ 1 ] == 1 :
                    return a [ N - 1 ]
                else :
                    return a [ N - 2 ]
return Main
