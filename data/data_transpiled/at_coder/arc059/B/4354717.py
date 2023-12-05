def main ( args ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    from os.path import join
    from os.path import dirname , join
    from os.path import join
    from os import sep
    from os.path import join
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os import chdir
    s = join ( dirname ( join ( dirname ( __file__ ) ) ) , sep )
    for i , s_tmp in enumerate ( s ) :
        t_count = 1
        f_count = 0
        for j in range ( i + 1 , len ( s ) ) :
            if s [ j ] == s_tmp :
                t_count += 1
                if t_count > f_count :
                    pl ( "%s %s" % ( ( i + 1 , j + 1 ) , join ( s [ j + 1 : ] ) ) )
                    return
            else :
                f_count += 1
                if t_count > f_count :
                    pl ( "%s %s" % ( ( i + 1 , j + 1 ) , join ( s [ j + 1 : ] ) ) )
                    return
                elif t_count < f_count :
                    break
    pl ( "-1 -1" )
def pr ( x ) :
    print ( x , end = ' ' )
def pl ( x ) :
    print ( x )
