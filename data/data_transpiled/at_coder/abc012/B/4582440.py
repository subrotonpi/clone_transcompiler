def main ( ) :
    import time
    from time import sleep
    from time import sleep
    second = sleep ( 1 )
    date = second / 3600
    d = ( '%02d' % date ).strftime ( '%H:%M' )
    minute = ( second % 3600 ) / 60
    m = ( '%02d' % minute ).strftime ( '%H:%M' )
    sec = ( ( second % 360 ) ) % 60
    s = ( '%02d' % sec ).strftime ( '%H:%M' )
    print ( '%s:%s:%s' % ( d , m , s ) )
