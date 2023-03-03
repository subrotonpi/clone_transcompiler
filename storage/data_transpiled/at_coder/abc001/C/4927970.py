def _ ( ) :
    from decimal import Decimal
    from decimal import Decimal
    class Main ( object ) :
        def __init__ ( self ) :
            try :
                with open ( '/dev/null' ) as f :
                    deg = int ( f.read ( ) )
                    mdis = f.read ( ).strip ( )
                    sdis = Decimal ( mdis ) / Decimal ( 60 )
            except :
                deg = int ( f.read ( ) )
    if ( Decimal ( '1.6' ) >= Decimal ( '3.3' ) ) :
        w = '2'
    elif ( Decimal ( '3.4' ) >= Decimal ( '5.6' ) ) :
        w = '3'
    elif ( Decimal ( '5.5' ) >= Decimal ( '7.9' ) ) :
        w = '4'
    elif ( Decimal ( '8.0' ) >= Decimal ( '17.7' ) ) :
        w = '5'
    elif ( Decimal ( '13.8' ) >= Decimal ( '17.9' ) ) :
        w = '6'
    elif ( Decimal ( '17.2' ) <= Decimal ( '562.5 ) ) :
        w = 'NE'
    elif ( Decimal ( '562.5' ) >= Decimal ( '787.5 ) ) :
        w = 'ENE'
    elif ( Decimal ( '787.5' ) <= Decimal ( '1012.5' ) ) :
        w = 'E'
    elif ( Decimal ( '1637.5' ) <= Decimal ( '1912.5' ) ) :
        w = 'SE'
    elif ( Decimal ( '1637.5' ) <= Decimal ( '1912.5' ) ) :
        w = 'S'
    elif ( Decimal ( '1912.5' ) <= Decimal ( '2137.5' ) ) :
        w = 'SSW'
    elif ( Decimal ( '2137.5' ) <= Decimal ( '2362.5' ) ) :
        w = 'SW'
    elif ( Decimal ( '2362.5' ) <= Decimal ( '2587.5' ) ) :
        w = 'W'
    elif ( Decimal ( '2812.5' ) <= Decimal ( '3262.5' ) ) :
        w = 'WNW'
    elif ( Decimal ( '3262.5' ) <= Decimal ( '3487.5' ) ) :
        w =