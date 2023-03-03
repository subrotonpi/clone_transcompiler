def main ( ) :
    from sys import stdin
    class B ( ) :
        def __init__ ( self ) :
            self.B = B
        def A ( self ) :
            with stdin :
                n = stdin.readline ( )
    def A ( ) :
        num = str ( n )
        if num [ 1 ] != num [ 2 ] :
            print ( "No" )
            return
        mid = num [ 1 ]
        if mid == num [ 0 ] or mid == num [ 3 ] :
            print ( "Yes" )
        else :
            print ( "No" )
    def B ( ) :
        with stdin :
            N = stdin.readline ( )
            if N == 1 :
                print ( 1 )
                return
            stdin.readline ( )
            Li = 2
            Lj = 1
            for i in range ( 2 , N + 1 ) :
                temp = Lj
                Lj = Li + Lj
                Li = temp
            print ( Lj )
