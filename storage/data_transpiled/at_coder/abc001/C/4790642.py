def _import ( ) : return round ( d * 10.0 ) / 10.0
def deg_to_dir ( deg ) :
    dirs = [ 'N' , 'NNE' , 'NE' , 'ENE' , 'E' , 'ESE' , 'SE' , 'SSE' , 'S' , 'SSW' , 'SW' , 'WSW' , 'W' , 'WNW' , 'NW' , 'NNW' ]
    i = ( deg + 112 ) % 3600 / 225
    return dirs [ i ]
def v_to_w ( v ) :
    upper = [ 0.2 , 1.5 , 3.3 , 5.4 , 7.9 , 10.7 , 13.8 , 17.1 , 20.7 , 24.4 , 28.4 , 32.6 ]
    for i in range ( 12 ) :
        if v <= upper [ i ] : return i
    return 12
def main ( ) :
    with open ( '/proc/sys/devices/' ) as f :
        ( deg , dis ) = f.read ( ).split ( '.' )
        v = round ( dis / 60.0 )
        dir = deg_to_dir ( deg ) if v > 0.2 else 'C'
        w = v_to_w ( v )
        print ( dir , w )
