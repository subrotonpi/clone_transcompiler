def main ( ) :
    import sys
    price = 700
    with open ( '/proc/cpuinfo','r' ) as f :
        order = f.read ( )
    chars = order.split ( ',' )
    for ch in chars :
        if ch == 'o' :
            price += 100
    print ( price )
