def main ( ) :
    import sys
    from random import randint
    reader = open ( sys.argv [ 1 ] )
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    C = randint ( 1 , 10000 )
    safe = A + B
    danger = C
    ans = min ( safe + 1 , danger )
    ans += B
    reader.close ( )
    sys.stdout.write ( ans )
