def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = self.n
            self.m = self.m
    ans = 0
    for i in range ( 1 , 2 ) :
        if m % i != 0 :
            continue
        j = m // i
        if n * j <= m :
            ans = max ( ans , j )
        if n * i <= m :
            ans = max ( ans , i )
    print ( ans )
