def main ( ) :
    import sys
    from string import ascii_letters
    sc = open ( '/etc/init.d/' , 'r' )
    s = sc.read ( )
    S = s.split ( '' )
    ans = 'Yes'
    south = north = east = west = 0
    for letter in S :
        if letter == 'S' :
            south += 1
        if letter == 'N' :
            north += 1
        if letter == 'W' :
            west += 1
        if letter == 'E' :
            east += 1
    if south and north <= 0 :
        ans = 'No'
    if north and south <= 0 :
        ans = 'No'
    if east and west <= 0 :
        ans = 'No'
    if west and east <= 0 :
        ans = 'No'
    print ( ans )
