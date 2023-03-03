def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os import sep
    from os.path import join
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    abc = join ( sep.join ( [ x.split ( ) for x in sep.split ( ) ] ) )
    sep.join ( [ sep.join ( [ x.split ( ) for x in sep.split ( ) ] ) for y in abc ] )
    a = int ( abc [ 0 ] )
    b = int ( abc [ 1 ] )
    c = int ( abc [ 2 ] )
    is_plus = a + b == c
    is_minus = a - b == c
    ret = ''
    if is_plus and is_minus :
        ret = '?'
    elif is_plus :
        ret = '+'
    elif is_minus :
        ret = '-'
    else :
        ret = '!'
    print ( ret )
