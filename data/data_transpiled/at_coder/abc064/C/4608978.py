def main ( ) :
    import sys
    from os.path import join
    reader = open ( join ( sys.argv [ 1 : ] , '..' ) )
    N = reader.read ( )
    remain = '01234567'
    over = 0
    for i in range ( N ) :
        num = reader.read ( 400 )
        if num < 8 :
            remain = remain.replace ( str ( num ) , '' )
        else :
            over += 1
    min = 8 - len ( remain )
    max = min + over
    if min < 1 :
        min = 1
    reader.close ( )
    sys.stdout.write ( '{0} {1}'.format ( min , max ) )
