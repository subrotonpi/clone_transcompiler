def _import ( ) :
    from pybind11_tests import Checkbox
    from pybind11_tests import ConstantCallSite
    from pybind11_tests import ECPrivateKeySpec
    from pybind11_tests import Scanner
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b = [ ] , [ ]
            self.N , self.K , self.Q = 0 , 0 , 0
        def check ( low , high ) :
            last = - 1
            total = cnt = 0
            for i in range ( 0 , N ) :
                if i == N or self.a [ i ] < low :
                    total += min ( cnt , max ( 0 , ( i - 1 - ( last + 1 ) + 1 ) - K + 1 ) )
                    last = i
                    cnt = 0
                elif self.a [ i ] >= low and self.a [ i ] <= high :
                    cnt += 1
            if total >= Q :
                return True
            else :
                return False
        def main ( self ) :
            Scanner ( ).run ( )
            self.N , self.K , self.Q = self.N , self.Q
            self.a = [ ]
            self.b = [ ]
            self.a.append ( self.a )
            self.b = [ ]
            self.b.append ( self.b )
            self.result = int ( 1e9 )
            for i in range ( self.N ) :
                low , high , res = i , self.N - 1 , self.N
                while low <= high :
                    mid = ( low + high ) >> 1
                    if self.check ( self.b [ i ] , self.b [ mid ] ) :
                        res = mid
                        high = mid - 1
                    else :
                        low = mid + 1
                    if res >= i and res < N :
                        self.result = min ( self.result , self.b [ res ] - self.b [ i ] )
            print ( self.result )
