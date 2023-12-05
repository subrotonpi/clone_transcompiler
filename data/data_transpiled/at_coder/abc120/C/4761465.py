def main ( ) :
    import sys
    from os.path import join
    from os import makedirs
    from os.path import join
    from os.path import exists
    S = join ( sys.stdin , 'S' )
    zero_count = one_count = 0
    for i in S :
        if i == '1' :
            zero_count += 1
        else :
            one_count += 1
    not_deleted_count = abs ( zero_count - one_count )
    res = len ( S ) - not_deleted_count
    print ( res )
