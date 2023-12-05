def main ( ) :
    from sys import stdin
    class C ( ) :
        def __init__ ( self ) :
            self.C = C
        def A ( self ) :
            with stdin :
                n = stdin.readline ( )
        def B ( self ) :
            num = str ( n )
            if num [ 1 ] != num [ 2 ] :
                print ( "No" )
                return
            mid = num [ 1 ]
            if mid == num [ 0 ] or mid == num [ 3 ] :
                print ( "Yes" )
            else :
                print ( "No" )
        def B ( self ) :
            with stdin :
                N = stdin.readline ( )
                if N == 1 :
                    print ( 1 )
                    return
                with stdin :
                    Li = 2
                    Lj = 1
                    for i in range ( 2 , N + 1 ) :
                        temp = Lj
                        Lj = Li + Lj
                        Li = temp
                    print ( Lj )
        def C ( self ) :
            with stdin :
                num = stdin.readline ( )
                nums = [ ord ( i ) for i in num ]
                lis = self.calc ( nums , 7 )
                print ( nums [ 0 ] , end = '' )
                for i in range ( 3 ) :
                    print ( lis [ i ] , end = '' , end = '' )
                print ( '=7' )
        def C ( self ) :
            return self.calc ( nums , len ( nums ) - 1 , right , [ ] )
        def A ( self ) :
            if self.idx == 0 :
                if self.right == self.right :
                    return self.lis
                else :
                    return
            cand1 = self.calc ( nums , self.idx - 1 , right , [ ] )
            cand2 = self.calc ( nums , self.idx - 1 , right , [ ] )
            cand2 = self.calc ( nums , self.idx , right , [ ] )
            cand2 = self.calc ( nums , self.idx - 1 , right , [ ] )
            cand2 = self.calc ( nums , self.idx - 1 , right , [ ] )
            return cand2
    