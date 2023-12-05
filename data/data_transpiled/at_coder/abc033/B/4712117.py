def main ( ) :
    import sys
    from os.path import join
    from os import urandom
    n = int ( urandom ( n ) )
    sum = max = 0
    name = 'atcoder'
    for s in range ( n ) :
        p = urandom ( n )
        sum += p
        if max < p :
            max = p
            name = s
    if sum / 2 >= max :
        name = 'atcoder'
    print ( name )
