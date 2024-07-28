object WarehouseInventory {
  def main(args: Array[String]): Unit = {
    // Example inventory maps
    val inventory1: Map[Int, (String, Int, Double)] = Map(
      101 -> ("ProductA", 10, 25.50),
      102 -> ("ProductB", 20, 40.00),
      103 -> ("ProductC", 5, 60.00)
    )

    val inventory2: Map[Int, (String, Int, Double)] = Map(
      102 -> ("ProductB", 15, 45.00),
      104 -> ("ProductD", 8, 30.00)
    )

    // I. Retrieve all product names from inventory1
    val productNames = inventory1.values.map(_._1)
    println("Product Names in Inventory1: " + productNames.mkString(", "))

    // II. Calculate the total value of all products in inventory1
    val totalValue = inventory1.values.map { case (_, quantity, price) => quantity * price }.sum
    println(s"Total Value of Inventory1: $$${totalValue}")

    // III. Check if inventory1 is empty
    val isEmpty = inventory1.isEmpty
    println(s"Is Inventory1 Empty? $isEmpty")

    // IV. Merge inventory1 and inventory2
    val mergedInventory = (inventory1.toSeq ++ inventory2.toSeq)
      .groupBy(_._1)
      .map { case (id, entries) =>
        val (name, totalQuantity, maxPrice) = entries.map(_._2).reduce { (p1, p2) =>
          (p1._1, p1._2 + p2._2, Math.max(p1._3, p2._3))
        }
        id -> (name, totalQuantity, maxPrice)
      }

    println("Merged Inventory: " + mergedInventory)

    // V. Check if a product with a specific ID (e.g., 102) exists and print its details
    val productId = 102
    inventory1.get(productId) match {
      case Some((name, quantity, price)) =>
        println(s"Product with ID $productId: Name = $name, Quantity = $quantity, Price = $$${price}")
      case None =>
        println(s"Product with ID $productId does not exist in Inventory1")
    }
  }
}
