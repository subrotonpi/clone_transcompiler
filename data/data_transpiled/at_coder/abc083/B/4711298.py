def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , self.a , self.b , self.digits_sum , self.total_sum = 0 , 0 , 0
        def __call__ ( self ) :
            self.n = self.n
            self.a = self.a
            self.b = self.b
            for i in range ( 1 , self.n + 1 ) :
                tmp = self.i
                for j in range ( 5 ) :
                    self.digits_sum += tmp % 10
                    self.tmp /= 10
                if self.a <= self.digits_sum <= self.b :
                    total_sum += self.i
                self.digits_sum = 0
        print ( total_sum )
