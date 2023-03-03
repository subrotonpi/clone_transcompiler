def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.h = int ( self.h )
            self.a = int ( self.a )
            self.b = int ( self.b )
            self.c = int ( self.c )
            self.d = int ( self.d )
            self.e = int ( self.e )
    ans = n * a
    for i in range ( 0 , n ) :
        right = n - i
        left = - 1
        while right - left > 1 :
            mid = ( left + right ) / 2
            if b * i + d * mid + h - ( n - mid - i ) * self.e > 0 :
                right = mid
            else :
                left = mid
        cost = a * i + right * c
        ans = min ( ans , cost )
    print ( ans )
