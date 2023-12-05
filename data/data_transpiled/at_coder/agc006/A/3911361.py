def solve ( N , S , T ) :
    import sys
    from sympy.utilities.iterables import solve
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = S
            self.T = T
        def solve ( self , N , S , T ) :
            for single in range ( 0 , N ) :
                flag = True
                for i in range ( self.N - single ) :
                    if S [ i + single ] != T [ i ] :
                        flag = False
                if flag :
                    return self.N + single
            return 2 * self.N
    def solve ( self , S , T ) :
        with open ( "input.txt" , "r" ) as sc :
            N , S , T = sc.read ( ).split ( " " )
        print ( solve ( self , N , S , T ) )
    return Main ( )
