def main ( ) :
    import sys
    from sys import stdin
    reader = stdin
    A = reader.read ( )
    B = reader.read ( )
    gap = B - A
    ans = - A
    for i in range ( 1 , gap ) :
        ans += i
    sys.stdout.write ( ans )
    reader.close ( )
