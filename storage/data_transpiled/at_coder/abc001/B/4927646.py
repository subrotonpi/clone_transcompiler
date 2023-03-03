def main ( ) :
    import sys
    try :
        with open ( '/proc/cpuinfo' , 'r' ) as f :
            m = f.read ( )
        result = ''
        if m < 100 :
            result = '00'
        elif ( m >= 100 and m <= 5000 ) :
            result = '%02d' % ( m * 10 // 1000 )
        elif ( m >= 6000 and m <= 30000 ) :
            result = '%02d' % ( m // 1000 + 50 )
        elif ( m >= 35000 and m <= 70000 ) :
            result = '%02d' % ( ( m // 1000 - 30 ) // 5 + 80 )
        elif m > 70000 :
            result = '89'
        print ( result )
    except :
        print ( 'Error running %s' % sys.argv [ 0 ] )
