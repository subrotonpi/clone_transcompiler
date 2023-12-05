def main ( x , y ) :
    import sys
    if y == 0 : return x
    return gcd ( y , x % y )
