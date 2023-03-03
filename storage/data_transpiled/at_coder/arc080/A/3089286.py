def import import sys , string , get_filesystem_encoding ( ) :
    from os import urandom
    from os.path import expanduser
    from os.path import join
    from os.path import dirname
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    N = int ( sys.argv [ 1 ] )
    a = [ join ( dirname ( join ( dirname ( __file__ ) ) ) , n ) for n in range ( N ) ]
    div_by_2 = [ 0 ] * 3
    for n in range ( N ) :
        if a [ n ] % 4 == 0 :
            div_by_2 [ 2 ] += 1
        elif a [ n ] % 2 == 0 :
            div_by_2 [ 1 ] += 1
        else :
            div_by_2 [ 0 ] += 1
    ans = True
    if div_by_2 [ 0 ] > div_by_2 [ 2 ] + 1 :
        ans = False
    if div_by_2 [ 0 ] == div_by_2 [ 2 ] + 1 and div_by_2 [ 1 ] > 0 :
        ans = False
    print ( 'Yes' if ans else 'No' )
