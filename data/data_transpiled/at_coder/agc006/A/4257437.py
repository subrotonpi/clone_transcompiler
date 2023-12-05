def main ( srgs ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    from os.path import abspath
    from os.path import dirname , join
    a = abspath ( join ( srgs , sep ) )
    str1 = join ( srgs , sep )
    str2 = join ( srgs , sep )
    str1 = str1 if len ( str1 ) < len ( str2 ) else str2
    lon = 0
    for i , j in enumerate ( str1 ) :
        if str1 [ i : len ( str1 ) ] == str2 [ : - i ] :
            lon = len ( str2 ) - i
            break
    print ( len ( str1 ) + len ( str2 ) - lon )
