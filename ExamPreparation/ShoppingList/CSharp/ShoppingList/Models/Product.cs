namespace ShoppingList.Models
{
    using System.ComponentModel.DataAnnotations;

    public class Product
    {

        //         id – technology-dependent identifier(ObjectID for JavaScript, int for all other technologies)
        // priority – non-null integer
        // name – non-empty text
        // quantity – non-null integer
        // status – non-empty text(will either be “bought” or “not bought”).
        [Key]
        public int Id { get; set; }
        
        public int Priority { get; set; }


        [Required]
        public string Name { get; set; }

        public int Quantity { get; set; }

        [Required]
        public string Status { get; set; }


    }
}
