def main ( srgs ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    a = join ( srgs , sep )
    for i in range ( 0 , len ( a ) + 1 ) :
        if i == len ( a ) :
            print ( "yes" )
            return
        ch = a [ i ]
        count = 0
        for ch2 in a [ i : ] :
            if ch == ch2 :
                count += 1
        if count != 1 :
            print ( "no" )
            return
