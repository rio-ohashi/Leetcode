fun tictactoe(moves: Array<IntArray>): String {

    for (index in moves.indices) {
        moves[index*2]
        moves[(index*2)+1]
    }


    if (moves.size == 9) return "Draw"
    return "Pending"
}


fun main() {
    print(
        tictactoe(
            arrayOf(
                intArrayOf(0, 0),
                intArrayOf(2, 0),
                intArrayOf(1, 1),
                intArrayOf(2, 1),
                intArrayOf(2, 2)
            )
        )
    )
}