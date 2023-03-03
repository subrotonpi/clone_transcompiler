def main ( ) :
    import sys
    from os.path import join
    from os import sep
    f = open ( join ( sys.argv [ 1 : ] , '..' ) )
    param = f.readline ( ).split ( )
    defo = int ( param [ 0 ] )
    nissu = int ( param [ 1 ] )
    limit = int ( param [ 2 ] )
    hojuu = int ( param [ 3 ] )
    tmp_maisu = defo
    if tmp_maisu <= limit :
        tmp_maisu += hojuu
    for i in range ( nissu ) :
        tmp_maisu -= int ( join ( sys.argv [ 1 : ] , '..' ) )
        if tmp_maisu < 0 :
            print ( i + 1 )
            return
        if tmp_maisu <= limit :
            tmp_maisu += hojuu
    print ( 'complete' )
