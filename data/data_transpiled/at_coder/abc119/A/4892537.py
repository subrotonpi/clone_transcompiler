def main ( ) :
    import sys
    from time import sleep
    from time import sleep
    from os.path import join
    from os import sep
    S = join ( sys.argv [ 1 : ] , sep )
    S = S.replace ( '/' , '' )
    date = int ( S )
    answer = ''
    if date <= 20190430 :
        answer = 'Heisei'
    else :
        answer = 'TBD'
    print ( answer )
