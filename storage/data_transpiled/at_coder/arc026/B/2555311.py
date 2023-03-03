def _ ( n ) :
    import math
    class Main ( object ) :
        def __init__ ( self , n ) :
            self.n = n
        def sum ( self ) :
            ret = 1
            for i in range ( 2 , math.sqrt ( n ) + 1 ) :
                if self.n % i == 0 :
                    if i == math.sqrt ( n ) :
                        ret += i
                    else :
                        ret += i
                        ret += self.n / i
            return ret
        def solve ( self ) :
            if self.n == 1 :
                print ( "Deficient" )
            elif sum ( self ) == self.n :
                print ( "Perfect" )
            elif sum ( self ) < self.n :
                print ( "Deficient" )
            else :
                print ( "Abundant" )
    def solve ( self ) :
        with open ( "/dev/null" , "r" ) as cin :
            n = cin.read ( )
        return Main ( n )
    return solve
