def main ( srgs ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    a = join ( srgs , sep )
    ans = [ ]
    for i in range ( 0 , len ( a ) ) :
        if i % 2 == 0 :
            ans.append ( a [ i ] )
    print ( ans )
    return
