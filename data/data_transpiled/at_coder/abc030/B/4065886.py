def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.n %= 12
            m = int ( self.m )
            minute = self.n * 60 + m
            lon = m * 6
            sht = minute * 0.5
            ans = math.fabs ( lon - sht )
            if ans > 180 :
                ans = 360 - ans
            print ( ans )
